package top.linxz.java.spring.boot.action.spring.ch3.conditional;

public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
