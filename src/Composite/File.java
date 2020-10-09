package Composite;

public class File implements DirectoryEntry{

    private String name = null;

    public File(String name){

        this.name = name;

    }

    public void remove(){

        System.out.println(name + "‚ğíœ‚µ‚Ü‚µ‚½");

    }

}