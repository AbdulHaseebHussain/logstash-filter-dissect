
import org.logstash.dissect.JavaDissectorLibrary;
import org.jruby.Ruby;
import org.jruby.runtime.load.BasicLibraryService;

import java.io.IOException;

public class JrubyDissectorService implements BasicLibraryService {
    public boolean basicLoad(final Ruby runtime)
            throws IOException
    {
        new JavaDissectorLibrary().load(runtime, false);
        return true;
    }
}
