/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author harsimransingh
 */
public class savinglocally {
 public static void toFile(Serializable obj, String fileName) {
                try {
                        FileOutputStream fos = new FileOutputStream("FormSaved\\" + fileName);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(obj);
                        oos.flush();
                        oos.close();
                } catch (Exception e) {
                        System.out.println("Exception during serialization: " + e);
                }
        }

        public static  Object toObject(String fileName) {
                Object obj = null;
                try {
                        FileInputStream fis = new FileInputStream("FormSaved\\" + fileName);
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        obj = ois.readObject();
                        ois.close();
                } catch (Exception e) {
                        System.out.println("Error while deserializing Check File Exist or not!!!!" );
                }
                return obj;
        }   
}
