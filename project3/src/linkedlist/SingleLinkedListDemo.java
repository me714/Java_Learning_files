package linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode  hero1 = new HeroNode(1, "�ν�", "��ʱ��");
        HeroNode hero2 = new HeroNode(2, "¬����", "������");
        HeroNode hero3 = new HeroNode(3, "����", "�Ƕ���");
        HeroNode hero4 = new HeroNode(4, "�ֳ�", "����ͷ");


        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);

        HeroNode heroNode = new HeroNode(2, "С¬", "������");
        singleLinkedList.update(heroNode);
        System.out.println("�޸ĺ���������~~");
        singleLinkedList.list();





    }

}
class SingleLinkedList{
    private HeroNode head = new HeroNode(0,"","");
    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }
    public void list(){
        if(head.next == null){
            System.out.println("����Ϊ��");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        boolean flag = false;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no > heroNode.no){
                break;
            }else if (temp.next.no == heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;

        }
        if(flag){
            System.out.printf("׼�������Ӣ�۵ı��%d�Ѿ������ˣ����ܼ���\n", heroNode.no);
        }else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }
    public void update(HeroNode newHeroNode){
        if(head.next == null){
            System.out.println("����Ϊ��~");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true){
            if(temp == null){
                break;
            }
            if (temp.no == newHeroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        }else {
            System.out.printf("û���ҵ����%d�Ľڵ㣬�����޸�\n",newHeroNode.no);
        }
    }
}
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

}
