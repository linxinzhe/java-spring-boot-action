package top.linxz.java.spring.boot.action.ch3.conditional;

public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
