package observer.push;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();        
    public void addObserver(Observer observer) {    
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) { 
        observers.remove(observer);
    }
    public void notifyObservers() {               
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();              
    public abstract void execute();               
}
