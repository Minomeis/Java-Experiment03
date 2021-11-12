package entity_first;

public class Teacher extends entity_first.People {
    //private Course course;
    private entity_first.Course[] c = new entity_first.Course[6];
    private int i;

    public Teacher(String name, int id, String sex){

    };

    public Teacher(int id,String name,String sex){
        super(name,id,sex);
    }

    public void add_course(entity_first.Course cc){
        setName(cc.getTeacher());
        c[i] = cc;
        i++;
    }

    public void show(){
        System.out.println(getName()+"的课表");
        int k = 1;
        for(int i=0;i<=this.i;i++) {
            if (c[i] == null) {
                continue;
            }
            else {
                System.out.print("课程"+ k);
                System.out.print(" 课程编号："+c[i].getId());
                System.out.print(" 上课时间："+c[i].getName());
                System.out.print(" 上课地点："+c[i].getPlace());
                System.out.print(" 课程人数："+c[i].getStu_num());
                System.out.println(" 上课时间：周"+c[i].getWeek() +" "+ c[i].getTime());
                k++;
            }
        }
    }
}
