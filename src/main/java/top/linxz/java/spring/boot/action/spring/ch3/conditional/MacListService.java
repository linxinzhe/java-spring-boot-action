package top.linxz.java.spring.boot.action.spring.ch3.conditional;

public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
