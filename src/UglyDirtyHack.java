import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UglyDirtyHack {
    public static void main(String[] args) {

    }
    public static Unsafe getUnsafe(){
        Unsafe unsafe = null;
    try {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        unsafe = (Unsafe) f.get(null);
    }catch (ReflectiveOperationException e){
        System.out.println("Who cares");
    }
    return unsafe;
    }

}
