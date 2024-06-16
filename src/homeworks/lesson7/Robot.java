package homeworks.lesson7;

public class Robot {

    private String name;
    private Head head;
    private Body body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Робот по имени " + name + " с " + head.getTitle() + " головой, с " + body.getTitle() + " телом";
    }
}
