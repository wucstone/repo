package com.wucstone.proxy;

public class Main {

    public static void main(String[] args) {
        Tools tools = new Computer();
        ToolsHander hander = new ToolsHander(tools);

        Tools proxy = (Tools) hander.getInstance();
        proxy.operate();
    }
}
