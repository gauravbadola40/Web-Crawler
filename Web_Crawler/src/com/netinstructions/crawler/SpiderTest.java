/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netinstructions.crawler;

/**
 *
 * @author Gaurav
 */
public class SpiderTest {
    
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        spider.search("http://animeshow.tv/", "Naruto");
    }
    
}
