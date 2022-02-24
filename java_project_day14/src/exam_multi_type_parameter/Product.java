package exam_multi_type_parameter;

public class Product<T, M> {
	private T kind;
	private M model;

	public Product() {

	}

	public Product(T kind, M model) {
		this.kind = kind; //��ǰ�� ����
		this.model = model; //��ǰ�� ��
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
