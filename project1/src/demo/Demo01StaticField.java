package demo;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("����", 19);
        one.room ="101����";
        System.out.println("������"+ one.getName()+"���䣺"+one.getAge()
                +"��ʦ��"+one.room+"ѧ�ţ�"+one.getId());
        Student two = new Student("����", 18);
        System.out.println("������"+ two.getName()+"���䣺"+two.getAge()
                +"��ʦ��"+one.room+"ѧ�ţ�"+two.getId());

    }
}
