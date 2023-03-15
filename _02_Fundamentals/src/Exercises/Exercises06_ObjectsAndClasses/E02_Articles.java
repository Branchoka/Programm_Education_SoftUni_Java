package Exercises06_ObjectsAndClasses;

import java.util.Scanner;

public class E02_Articles {
    private static class Articles{
        private String title;
        private String content;
        private String author;

        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void edit(String newContent){
            this.content=newContent;
        }
        public void editAuthor(String newAuthor){
            this.author=newAuthor;
        }
        public void renameTitle(String newTitle){
            this.title=newTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String articleData=scanner.nextLine();

        String[] dataArr=articleData.split(", ");

        String title=dataArr[0];
        String content=dataArr[1];
        String author=dataArr[2];

        Articles articles=new Articles(title,content,author);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String command=scanner.nextLine();

            if (command.contains("Edit")){
                String newContent=command.split(": ")[1];
                articles.edit(newContent);

            }else if (command.contains("Rename")){
                String newTitle=command.split(": ")[1];
                articles.renameTitle(newTitle);

            }else if (command.contains("ChangeAuthor")){
                String newAuthor=command.split(": ")[1];
                articles.editAuthor(newAuthor);
            }
        }
        System.out.println(articles.toString());
    }
}
