package com.tmall.wireless;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by hongyunmhy on 15/9/15.
 */
public class TMChangeVersionPropertiesToPom {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		File versionFile = new File("/Users/hongyunmhy/dev/source/tmallandroid_830/tmallandroid/version.properties");
		File pomFile = new File("/Users/hongyunmhy/dev/source/tmallandroid_830/tmall_parent_pom/pom.xml");
		String pomStr = FileUtils.readFileToString(pomFile);
		Properties p = new Properties();
		p.load(new FileInputStream(versionFile));
		Set<Object> ks = p.keySet();
		for (Object key : ks) {
			String k = key.toString().trim();
			String version = p.getProperty(k).trim();
			System.out.println(k + ":" + version);
			pomStr = pomStr.replaceAll("<" + k + ">\\S+</" + k + ">", "<" + k + ">" + version + "</" + k + ">");
		}
		System.out.println(pomStr);
		FileUtils.writeStringToFile(pomFile, pomStr);

	}

}
