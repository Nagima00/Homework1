import MyArrayList.MyArrayList;

MyArrayList<Integer> list = new MyArrayList<>();
list.add(10); list.add(30); list.add(50);
list.add(1, 20);
list.set(1, 40); list.set(2, 40);
list.remove(1);
list.add(list.indexOf(10), 60);
list.removeObject(20);
list.add(list.indexOf(40), 70);
list.remove(2);
System.out.println(list);
}
