package org.spring.cert.filestore.local;


import org.spring.cert.filestore.FileStore;

class LocalFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("local filestore");
    }
}
