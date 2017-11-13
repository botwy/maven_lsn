interface  Page {
    String getHeader();

    String getContent();

    String getFooter();
}

abstract class PageAbstract implements Page{
    public  String getHeader() {return  "welcome";}
}



class Page1 extends PageAbstract{
    public  String getHeader() {return  "welcome";}

    public  String getContent() {return  "content";}

    public  String getFooter() {return  "footer";}
}

class Page2{
    public  String getHeader() {return  "welcome";}

    public  String getContent() {return  "content2";}

    public  String getFooter() {return  "footer2";}
}

public class FabricMethod {

}
