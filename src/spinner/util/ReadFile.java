package spinner.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import matrix.util.StringList;

import org.apache.commons.io.FileUtils;

import com.matrixone.apps.domain.util.FrameworkUtil;

public class ReadFile {

	public static void readFile() throws IOException {

		File file = new File("SpinnerAssociationData_ALL.xls");
		List<String> listLine = FileUtils.readLines(file);
		String sHeader = listLine.get(0);
		StringList slHeader = new StringList();
		slHeader = FrameworkUtil.split(listLine.get(0), "\t");
		int i = 1;
		System.out.println("line Header : " +slHeader);
		for (int j = 1; j < listLine.size(); j++) {
			System.out.println(listLine.get(j));
		}
		
		/*for (String sLine : listLine) {
			// if(sLine.contains("+"))
			System.out.println("line no : " + i + " ==" + sLine);
			i++;
		}*/
		//writing to a file 
		File fileOutput = new File("delta.txt");
	    FileUtils.writeStringToFile(fileOutput, sHeader, true);
	}

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}