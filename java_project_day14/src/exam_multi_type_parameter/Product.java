package exam_multi_type_parameter;

public class Product<T, M> {
	private T kind;
	private M model;

	public Product() {

	}

	public Product(T kind, M model) {
		this.kind = kind; //상품의 종류
		this.model = model; //상품의 모델
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "kind: " + kind.getClass().getSimpleName().toUpperCase() + ", model: " + model;
	}

}
