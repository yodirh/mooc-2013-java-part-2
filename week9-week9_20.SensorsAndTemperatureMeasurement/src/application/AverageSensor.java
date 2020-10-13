package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sens;
    private List<Integer> alllist = new ArrayList<Integer>();

    public AverageSensor() {
        this.sens = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor additional) {
        sens.add(additional);

    }

    public List<Integer> readings() {
        return alllist;
    }

    @Override
    public boolean isOn() {
        int i = 0;
        for (Sensor s : sens) {
            if (s.isOn() == true) {
                i += 1;
            }
        }
        return i == sens.size();
    }

    @Override
    public void on() {
        for (Sensor s : sens) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : sens) {
            s.off();
        }

    }

    @Override
    public int measure() {
        if (!isOn() || sens.isEmpty()) {
            throw new IllegalStateException();
        }
        int i = 0;
        for (Sensor s : sens) {
            i = i + s.measure();
        }
        int m = i / sens.size();
        alllist.add(m);
        return m;
        

    }

}
