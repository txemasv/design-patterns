package behavioral.chain_of_responsibility;

interface ChainItem {
    void setNext(ChainItem nextInChain);
    void play(String isan);
}
