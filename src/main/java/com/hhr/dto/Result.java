package com.hhr.dto;

/**
 * 封装json对象，所有返回结果都使用它
 */
/**
 * 那么有没有什么办法可以使集合能够记住集合内元素各类型，
 * 且能够达到只要编译时不出现问题，
 * 运行时就不会出现“java.lang.ClassCastException”异常呢？
 * 答案就是使用泛型。
 */
/**
 * 泛型，即“参数化类型”。
 * 一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。
 * 那么参数化类型怎么理解呢？
 * 顾名思义，就是将类型由原来的具体的类型参数化，
 * 类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），
 * 然后在使用/调用时传入具体的类型（类型实参）。
 */
/**
 * 在泛型接口、泛型类和泛型方法的定义过程中，
 * 我们常见的如T、E、K、V等形式的参数常用于表示泛型形参，
 * 由于接收来自外部使用时候传入的类型实参。
 */
/**
 * 由此，我们发现，在使用泛型类时，虽然传入了不同的泛型实参，
 * 但并没有真正意义上生成不同的类型，传入不同泛型实参的泛型类在内存上只有一个，
 * 即还是原来的最基本的类型（本实例中为Box），
 * 当然，在逻辑上我们可以理解成多个不同的泛型类型。
 * 究其原因，在于Java中的泛型这一概念提出的目的，
 * 导致其只是作用于代码编译阶段，
 * 在编译过程中，对于正确检验泛型结果后，会将泛型的相关信息擦除，
 * 也就是说，成功编译过后的class文件中是不包含任何泛型信息的。
 * 泛型信息不会进入到运行时阶段。
 */
/**
 * 泛型类型在逻辑上看以看成是多个不同的类型
 * 实际上都是相同的基本类型
 */

public class Result<T> {

    private boolean success; //是否成功标志 //true为成功

    private T data; //成功时返回的数据

    private String error; //错误信息

    public Result() {
        //空构造方法
    }

    public Result(boolean success, T data) {
        // 成功时的构造器  //true + 成功返回的数据
        this.success = success;
        this.data = data;
    }

    public Result(boolean success, String error) {
        // 错误时的构造器  //false + 错误信息
        this.success = success;
        this.error = error;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "JsonResult [success=" +
                success + ", data=" +
                data + ", error=" +
                error + "]";
    }

}
