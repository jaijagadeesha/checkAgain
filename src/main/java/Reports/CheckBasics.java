package Reports;

import java.io.File;
import java.util.Date;

public class CheckBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Date d=new Date();
		System.out.println(d);
		//Thu Aug 06 21:20:22 IST 2020
		String reportFolder=d.toString().replace(":","_");
		String path="E:\\JaiCheckReports\\"+reportFolder;
		File file=new File(path);
		file.mkdir();
		String patha="E:\\JaiCheckReports\\"+reportFolder+"\\ScreenShots";
		File file1=new File(patha);
		file1.mkdirs();
		
				
		

	}

}
