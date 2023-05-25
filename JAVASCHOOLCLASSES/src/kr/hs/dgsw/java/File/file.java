package kr.hs.dgsw.java.File;

import java.io.File;
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

    public File makeDir(File path) {
        File subDir = new File(path, "subDir");
        subDir.mkdir();
        return subDir;
    }

    public void deleteDir(File dir) {
        dir.delete();
    }

    public static void main(String[] args) {
        file f = new file();
        f.fileMethod();
        File subDir = f.makeDir(new File("C:/Users/g8808/Documents/GitHub/JavaLearningInSchool/JAVASCHOOLCLASSES/src/kr/hs/dgsw/java/Exception/"));

        System.out.printf("subDir을 삭제하려면 x를 입력하세요.\n> ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (word.equals("x")) {
            f.deleteDir(subDir);
            System.out.println("delete");
        }
    }
}
