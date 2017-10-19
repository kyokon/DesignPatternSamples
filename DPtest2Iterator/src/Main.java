public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);//本を追加
        bookShelf.appendBook(new Book("Knights of the Round Table"));
        bookShelf.appendBook(new Book("Excalibur"));
        bookShelf.appendBook(new Book("King Arthur"));
        bookShelf.appendBook(new Book("Merlin"));

        //課題ここから
        Iterator it = ;//bookShelfのもつイテレータを召喚
        while(it.){//BookShelfに次の本があれば
            Book book = (Book)it.;//次の本に移動
            System.out.println(book.getName());//本の名前を表示
        }
        //ここまで
    }
}
