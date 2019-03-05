package composite;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

/**
 * 组合模式：viewGroup和View 的关系  File 和Dir的关系
 */
class Dir extends File{

    List<File> files = new ArrayList<>();
    public Dir(String pathname) {
        super(pathname);
    }

    public Dir(String parent, String child) {
        super(parent, child);
    }

    public Dir(File parent, String child) {
        super(parent, child);
    }

    public Dir(URI uri) {
        super(uri);
    }

    void add(File file){
        files.add(file);
    }

    void remove(File file){
        files.remove(file);
    }
}
