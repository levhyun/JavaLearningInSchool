package kr.hs.dgsw.java.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class file {
    public void fileMethod() {
        File file = null;
        File file2 = null;
        file = new File("C:/Users/g8808/Documents/GitHub/JavaLearningInSchool/JAVASCHOOLCLASSES/src/kr/hs/dgsw/java/Exception/hello.txt");
        file2 = new File("C:/Users/g8808/hello123.txt");

        Boolean isFile = file.exists();
        Boolean isFile2 = file2.exists();
        System.out.printf("%s 존재 여부 : %b\n",file.getName(), isFile);
        System.out.printf("%s 존재 여부 : %b\n",file2.getName(), isFile2);

        File dir = new File("C:/Users/g8808/Documents/GitHub/JavaLearningInSchool/JAVASCHOOLCLASSES/src/kr/hs/dgsw/java/Exception/");
        Boolean isDir = dir.exists();
        System.out.printf("%s 존재 여부 : %b\n",dir.getName(), isDir);

        System.out.printf("%s 디렉터리 여부 : %b\n", dir.getName() , dir.isDirectory());
        System.out.printf("%s 파일 여부 : %b\n", dir.getName() , dir.isFile());

        System.out.printf("%s 디렉터리 여부 : %b\n", file2.getName() , file2.isDirectory());
        System.out.printf("%s 파일 여부 : %b\n", file2.getName() , file2.isFile());
    }

    public void makeFile(String path, String fileName) {
        File file = new File(path, fileName);
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
        try {
            file.createNewFile();
        } catch (IOException e) {

        }
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
    }

    public void deleteFile(String path, String fileName) {
        File file = new File(path, fileName);
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
        file.delete();
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
    }

    public File makeDir(File path) {
        File subDir = new File(path, "subDir");
        subDir.mkdir();
        return subDir;
    }

    public void deleteDir(File dir) {
        dir.delete();
    }

    public void printFileInformation(File file) {
        long size = file.length();
        System.out.printf("%s의 크기 : %d\n", file.getName(), size);
        long lastUpdateTime = file.lastModified();
        Date date = new Date(lastUpdateTime);
        System.out.printf("%s의 마지막 수정 시간 : %s\n", file.getName(), date.toString());
    }

    public void printFiles(File directory) {
        String[] names = directory.list();
        for (String name : names) {
            System.out.printf("\t%s\n", name);
        }
    }

    public void printdirectory(File directoryPath) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String dirName = directoryPath.getName();
        String[] names = directoryPath.list();
        System.out.printf("폴더명 : %s\t\t하위 파일 수 : %d\n", dirName, names.length);
        for (String name : names) {
            File file = new File(directoryPath, name);
            System.out.printf("%s\t\t%s\t\t%d\n", name, dateFormat.format(new Date(file.lastModified())), file.length());
        }
    }

    public static void main(String[] args) {
        file f = new file();
        f.fileMethod();
        File subDir = f.makeDir(new File("C:\\Users\\g8808\\Documents\\GitHub\\JavaLearningInSchool\\JAVASCHOOLCLASSES\\src\\kr\\hs\\dgsw\\java\\File"));
//        System.out.printf("subDir을 삭제하려면 x를 입력하세요.\n> ");
//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
//        if (word.equals("x")) {
//            f.deleteDir(subDir);
//            System.out.println("delete");
//        }

        f.makeFile("C:\\Users\\g8808\\Documents\\GitHub\\JavaLearningInSchool\\JAVASCHOOLCLASSES\\src\\kr\\hs\\dgsw\\java\\File\\subDir", "dgsw.txt");
        f.deleteFile("C:\\Users\\g8808\\Documents\\GitHub\\JavaLearningInSchool\\JAVASCHOOLCLASSES\\src\\kr\\hs\\dgsw\\java\\File\\subDir", "dgsw.txt");

        File file = new File("C:\\Users\\g8808\\Documents\\GitHub\\JavaLearningInSchool\\JAVASCHOOLCLASSES\\src\\kr\\hs\\dgsw\\java\\File\\가나다.txt");
        f.printFileInformation(file);

        for (int i = 1; i <= 5; i++) {
            f.makeFile("C:\\Users\\g8808\\Documents\\GitHub\\JavaLearningInSchool\\JAVASCHOOLCLASSES\\src\\kr\\hs\\dgsw\\java\\File\\subDir", String.format("%d.txt", i));
        }

        File directory = new File("C:\\Users\\g8808\\Documents\\GitHub\\JavaLearningInSchool\\JAVASCHOOLCLASSES\\src\\kr\\hs\\dgsw\\java\\File\\subDir");
        f.printFiles(directory);

        f.printdirectory(directory);
    }
}
