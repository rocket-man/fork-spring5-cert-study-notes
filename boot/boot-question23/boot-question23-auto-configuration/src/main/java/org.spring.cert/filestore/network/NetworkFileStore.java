package org.spring.cert.filestore.network;


import org.spring.cert.filestore.FileStore;

class NetworkFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("network filestore");
    }
}
