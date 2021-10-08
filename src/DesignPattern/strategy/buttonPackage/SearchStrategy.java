package DesignPattern.strategy.buttonPackage;

interface SearchStrategy {
    void search();
}

class SearchStrategyAll implements SearchStrategy {
    // 전체 검색하는 코드
    @Override
    public void search() {
        System.out.println("SEARCH ALL");
    }
}

class SearchStrategyImage implements SearchStrategy {
    // 이미지 검색하는 코드
    @Override
    public void search() {
        System.out.println("SEARCH IMAGE");
    }
}

class SearchStrategyNews implements SearchStrategy {
    // 뉴스 검색하는 코드
    @Override
    public void search() {
        System.out.println("SEARCH NEWS");
    }
}

class SearchStrategyMap implements SearchStrategy {
    // 지도 검새하는 코드
    @Override
    public void search() {
        System.out.println("SEARCH MAP");
    }
}
