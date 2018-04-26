package top.linxz.java.spring.boot.action.spring.ch3.conditional;

public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
