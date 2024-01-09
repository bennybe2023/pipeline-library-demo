
import static groovy.io.FileType.DIRECTORIES
def list = [""]
new File('/tmp').eachFile(DIRECTORIES) { file ->
        def fileName = file.name;
        
        if (fileName.startsWith('.')){
            println "a66"
        } else {
            list.add(fileName + "");
        }
}
return list
// list.each{ jobName ->
//     println jobName
// }