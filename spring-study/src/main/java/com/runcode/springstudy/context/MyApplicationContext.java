package com.runcode.springstudy.context;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApplicationContext extends FileSystemXmlApplicationContext{

    public MyApplicationContext(String s) {
        super(s);
    }

    @Override
    protected void onClose() {
        System.out.println("MyApplicationContext close...............");
        super.onClose();
    }
}
