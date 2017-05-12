package ke.co.miles.zip;

import java.io.FileNotFoundException;

/**
 *
 * @author siech
 */
public interface ZipRequestsLocal {

    /**
     *
     * @param sourceFolder
     * @param destinationZipFile
     * @throws FileNotFoundException
     * @throws Exception
     */
    public void zipFolder(String sourceFolder, String destinationZipFile) throws FileNotFoundException, Exception;

}
