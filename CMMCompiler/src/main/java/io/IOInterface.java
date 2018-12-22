package io;

/**
 * Created by Alex on 2018.11.12
 */
public interface IOInterface {

    void close();

    String stdin(String tips);

    String stdin();

    void stdout(Object out);

    void stderr(Object out);
}