package com.google.code.kaptcha.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import com.google.code.kaptcha.BackgroundProducer;
import com.google.code.kaptcha.GimpyEngine;
import com.google.code.kaptcha.text.TextProducer;
import com.google.code.kaptcha.text.WordRenederer;

/**
 * 
 */
public interface CaptchaProducer
{
	/**
	 * Create an image which have witten a distorted text, text given 
	 * as parameter. The result image is put on the output stream
	 * 
	 * @param stream the OutputStream where the image is written
	 * @param text the distorted characters written on imagage
	 * @throws IOException if an error occurs during the image written on
	 * output stream.
	 */
	public abstract void createImage(OutputStream stream, String text) throws IOException;

	public abstract void setBackGroundImageProducer(BackgroundProducer background);

	public abstract void setObscurificator(GimpyEngine engine);

	/**
	 * @param properties
	 */
	public abstract void setProperties(Properties properties);

	public abstract void setTextProducer(TextProducer textP);

	public abstract String createText();

	public abstract void setWordRenderer(WordRenederer renederer);
}