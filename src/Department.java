import java.util.ArrayList;

  class Department {
private String name;
private String location;
private ArrayList<Position> positions;

public Department(String name, String location) {
        this.name = name;
        this.location = location;
        this.positions = new ArrayList<>();
        }

public void addPosition(Position position) {
        positions.add(position);
        }

public ArrayList<Position> getPositions() {
        return positions;
        }

public void print() {
        System.out.println("Department: " + name + " - Location: " + location);
        for (Position position : positions) {
        position.print();
        }
        }
        }

