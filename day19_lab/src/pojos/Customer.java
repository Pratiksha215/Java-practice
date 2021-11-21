package pojos;

import java.sql.Date;

public class Customer {
		private int custId;
		private double depositAmt;
		private String emailId, custName;
		private Date regDate;
		private String password;
		private String role;

		public Customer() {
			super();
		}

		public Customer(double depositAmt, String emailId, String custName, Date regDate, String password, String role) {
			super();
			this.depositAmt = depositAmt;
			this.emailId = emailId;
			this.custName = custName;
			this.regDate = regDate;
			this.password = password;
			this.role = role;
		}

		public Customer(int custId, double depositAmt, String emailId, String custName, Date regDate, String password,
				String role) {
			super();
			this.custId = custId;
			this.depositAmt = depositAmt;
			this.emailId = emailId;
			this.custName = custName;
			this.regDate = regDate;
			this.password = password;
			this.role = role;
		}

		public int getCustId() {
			return custId;
		}

		public void setCustId(int custId) {
			this.custId = custId;
		}

		public double getDepositAmt() {
			return depositAmt;
		}

		public void setDepositAmt(double depositAmt) {
			this.depositAmt = depositAmt;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public Date getRegDate() {
			return regDate;
		}

		public void setRegDate(Date regDate) {
			this.regDate = regDate;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		@Override
		public String toString() {
			return "Customer [custId=" + custId + ", depositAmt=" + depositAmt + ", emailId=" + emailId + ", custName="
					+ custName + ", regDate=" + regDate + ", password=" + password + ", role=" + role + "]";
		}

	}


