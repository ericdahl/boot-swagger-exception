package example;

public class Response {

    private final CustomMap<Integer> customMap;

    public Response(CustomMap<Integer> customMap) {
        this.customMap = customMap;
    }

    public CustomMap<Integer> getCustomMap() {
        return customMap;
    }
}
