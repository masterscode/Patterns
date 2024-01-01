package patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author imanuel
 * @implNote This is an assessment code
 */
public class TestTaker {

    protected static final Map<String, Shape> shapeIdRegistry = new HashMap<>();

    public static String output(String[] commands) {
        //Insert your code here
        for (String command : commands) {
            String[] comm = command.split(" ");
            String action = comm[0];
            if (action.equalsIgnoreCase("add")){
                shapeIdRegistry.put(comm[2], shapeFactory(
                        comm[1], comm[2],
                        comm[3], comm[4]
                ));
            }
        }

        List<String> areas = new ArrayList<>();
        for (String command : commands) {
            String[] comm = command.split(" ");
            String action = comm[0];
            if (action.equalsIgnoreCase("area")){
                String id =comm[1];
                String value = shapeIdRegistry.get(id).getArea();
                areas.add(value);
            }
        }

        return String.join(",", areas);

    }


     static Shape shapeFactory(String shape,String id,  String p1, String p2) {
        int param1 = Integer.parseInt(p1);
        int param2 = Integer.parseInt(p2);
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle(id, param1, param2 );

        }else {
            return new Triangle(id, param1, param2 );
        }
    }


    abstract static class Shape {
        public String id;

        public Shape(String id) {
            this.id = id;
        }
        abstract String getArea();
    }

    public static class Triangle extends Shape {
        public int base, height;
        public Triangle(String id, int base, int height){
            super(id);
            this.base = base;
            this.height = height;
        }

        @Override
        String getArea() {
            double area = (0.5) * base * height;
            return String.valueOf( area );
        }
    }

    public static class Rectangle extends Shape {
        public int width, height;
        public Rectangle(String id, int width, int height){
            super(id);
            this.width = width;
            this.height = height;
        }

        @Override
        String getArea() {
            return String.valueOf(2 * (width + height));
        }
    }


}
