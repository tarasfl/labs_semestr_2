package museum;

class Sculpture extends Exhibit{
    private float height;
    private float lenth;
    private float width;
    private float weight;
    private String style;

    public Sculpture(){
        super();
        height=0;
        lenth=0;
        width=0;
        weight=0;
        style="modno";
    }
    public Sculpture(float height, float length, float width, float weight, String style){
        height=height;
        length=length;
        width=width;
        weight=weight;
        style= style;
    }

}