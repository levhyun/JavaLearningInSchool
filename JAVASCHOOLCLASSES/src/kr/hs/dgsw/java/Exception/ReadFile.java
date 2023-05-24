package kr.hs.dgsw.java.Exception;

import java.io.*;

public class ReadFile {
    public String readFile(String filePath) {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String result = "";
            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }

            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readFile2(String filePath) throws IOException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        String result = "";
        while ((line = bufferedReader.readLine()) != null) {
            result += line + "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        String str = readFile.readFile("C:\\Users\\g8808\\Documents\\GitHub\\JavaLearningInSchool\\JAVASCHOOLCLASSES\\src\\kr\\hs\\dgsw\\java\\Exception\\hello.txt");
        System.out.println(str);
    }
}
