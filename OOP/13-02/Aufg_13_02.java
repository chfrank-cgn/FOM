// Aufg_13_02.java

import java.io.*;
import java.util.*;

public class Aufg_13_02 {

	public static void main(String[] args) {
		
		Properties nfsCommon = new Properties();
		FileInputStream config = null;

		try {

			config = new FileInputStream("nfs-common");

			nfsCommon.load(config);

			System.out.println(nfsCommon.getProperty("NEED_STATD"));
			System.out.println(nfsCommon.getProperty("STATDOPTS"));
			System.out.println(nfsCommon.getProperty("NEED_IDMAPD"));
			System.out.println(nfsCommon.getProperty("NEED_GSSD"));

			config.close();

		} catch(IOException ioex) {
			ioex.printStackTrace();
		}

	}
}

