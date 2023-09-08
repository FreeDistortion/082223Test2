import java.io.BufferedReader;
import java.io.FileReader;

public class FileCalculator {

	public void addCalculateResult(String inputFileName) throws Exception {

		BufferedReader bf = null;

		while (true) {
			bf = new BufferedReader(new FileReader("src/data/data.txt"));
		}

	}
}