package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";              
   
    public void visit(File file) {                
        System.out.println(currentdir + "/" + file);
    }
    
    public void visit(Directory directory) {  
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
           // if(entry.getName() == "tmp")
           // 	continue;
            
            entry.accept(this);
            
        }
        currentdir = savedir;
    }
}
