package DesignPattern.adapter;

interface FindAlgorithm {
    void find(boolean global);
}

class FindMovieAlgorithm implements FindAlgorithm {
    // 동영상 검색 코드
    @Override
    public void find(boolean global) {
        System.out.println("find movie" + (global ? " globally" : ""));
    }
}
