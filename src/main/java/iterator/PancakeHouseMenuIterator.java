//package iterator;
//
//import java.util.List;
//
//public class PancakeHouseMenuIterator implements Iterator{
//    List<MenuItem> menuItems;
//    int position = 0;
//
//    public PancakeHouseMenuIterator (MenuItem[] items) {
//        this.items = items;
//    }
//
//    public MenuItem next() {
//        MenuItem menuItem = items[position];
//        position = position + 1;
//        return menuItem;
//    }
//
//    public boolean hasNext(){
//        if (position >= items.length || items[position] == null) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//}
