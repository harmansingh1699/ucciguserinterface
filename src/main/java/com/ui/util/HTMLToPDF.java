/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.log.Level;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import com.itextpdf.tool.xml.NoCustomContextException;
import com.itextpdf.tool.xml.Pipeline;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFilesImpl;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.HTML;
import com.itextpdf.tool.xml.html.TagProcessorFactory;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

class ImageTagProcessor extends com.itextpdf.tool.xml.html.Image {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itextpdf.tool.xml.TagProcessor#endElement(com.itextpdf.tool.xml.Tag,
	 * java.util.List, com.itextpdf.text.Document)
	 */
	@Override
	public List<Element> end(final WorkerContext ctx, final Tag tag,
			final List<Element> currentContent) {
		final Map<String, String> attributes = tag.getAttributes();
		String src = attributes.get(HTML.Attribute.SRC);
		List<Element> elements = new ArrayList<Element>(1);
		if (null != src && src.length() > 0) {
			Image img = null;
			if (src.startsWith("data:image/")) {
				final String base64Data = src.substring(src.indexOf(",") + 1);
				try {
					img = Image.getInstance(Base64.decode(base64Data));
				} catch (Exception e) {
					if (logger.isLogging(Level.ERROR)) {
						logger.error(String.format(
								LocaleMessages.getInstance().getMessage(
										LocaleMessages.HTML_IMG_RETRIEVE_FAIL),
								src), e);
					}
				}
				if (img != null) {
					try {
						final HtmlPipelineContext htmlPipelineContext = getHtmlPipelineContext(ctx);
						elements.add(getCssAppliers()
								.apply(new Chunk(
										(com.itextpdf.text.Image) getCssAppliers()
												.apply(img, tag,
														htmlPipelineContext),
										0, 0, true), tag, htmlPipelineContext));
					} catch (NoCustomContextException e) {
						throw new RuntimeWorkerException(e);
					}
				}
			}

			if (img == null) {
				elements = super.end(ctx, tag, currentContent);
			}
		}
		return elements;
	}
}

public class HTMLToPDF {/*
						 * 
						 * public void getPDF(String html) { try { Document
						 * document = new Document(); PdfWriter writer;
						 * 
						 * writer = PdfWriter.getInstance(document, new
						 * FileOutputStream(
						 * "/Users/ravjotsingh/Desktop/pdf.pdf"));
						 * 
						 * document.open();
						 * XMLWorkerHelper.getInstance().parseXHtml(writer,
						 * document, new FileInputStream(html));
						 * 
						 * document.close(); } catch (DocumentException |
						 * IOException e) { e.printStackTrace(); } }
						 * 
						 * public static void main(String[] args) { new
						 * HTMLToPDF
						 * ().getPDF("/Users/ravjotsingh/Desktop/t.html"); }
						 */
	public static void main(String[] args) {
		//convertHtmlToPdf();

	}

	public static void convertHtmlToPdf(String html) {
		try {
			final OutputStream file = new FileOutputStream(new File(
					"Form.pdf"));
			final Document document = new Document();
			final PdfWriter writer = PdfWriter.getInstance(document, file);
			document.open();
			final TagProcessorFactory tagProcessorFactory = Tags
					.getHtmlTagProcessorFactory();
			tagProcessorFactory.removeProcessor(HTML.Tag.IMG);
			tagProcessorFactory.addProcessor(new ImageTagProcessor(),
					HTML.Tag.IMG);

			final CssFilesImpl cssFiles = new CssFilesImpl();
			cssFiles.add(XMLWorkerHelper.getInstance().getDefaultCSS());
			final StyleAttrCSSResolver cssResolver = new StyleAttrCSSResolver(
					cssFiles);
			final HtmlPipelineContext hpc = new HtmlPipelineContext(
					new CssAppliersImpl(new XMLWorkerFontProvider()));
			hpc.setAcceptUnknown(true).autoBookmark(true)
					.setTagFactory(tagProcessorFactory);
			final HtmlPipeline htmlPipeline = new HtmlPipeline(hpc,
					new PdfWriterPipeline(document, writer));
			final Pipeline<?> pipeline = new CssResolverPipeline(cssResolver,
					htmlPipeline);
			final XMLWorker worker = new XMLWorker(pipeline, true);
			final Charset charset = Charset.forName("UTF-8");
			final XMLParser xmlParser = new XMLParser(true, worker, charset);
			final InputStream is = new FileInputStream(
					html);
			xmlParser.parse(is, charset);

			is.close();
			document.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO
		}
	}
}
