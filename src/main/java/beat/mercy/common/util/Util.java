package beat.mercy.common.util;


import java.io.File;
import java.util.Vector;


/**
 * @author lin.yao
 *
 */
public class Util {

    /**
     * get all files under the directory path
     * 
     * @param path
     * @param files
     */
    public static void getFiles(final String path, Vector<String> files) {
        getFiles(new File(path), files);
    }

    /**
     * delete and create a new directory with the same name
     * 
     * @param dir
     */
    public static void recreateDir(final String dir) {
        new File(dir).delete();
        new File(dir).mkdir();
    }
    
    public static String makeFloderDirectory(final String floderPath) {
		if (!floderPath.startsWith(ServiceConst.UPLOAD_ROOT_PATH)) {
			System.err.println("非项目文件路径！");
			return null;
		}
		File directory = new File(floderPath);
		if (!directory.exists()) {
			directory.mkdirs();
		}
		return floderPath;
	}
    
    private static void getFiles(final File dir, Vector<String> files) {
        File[] filelist = dir.listFiles();
        for (File file : filelist) {
            if (file.isDirectory()) {
                getFiles(file, files);
            } else {
                files.add(file.getAbsolutePath());
            }
        }
    }
}
