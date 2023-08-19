package golang

import "testing"

func Test_repeatedString(t *testing.T) {
	type args struct {
		s string
		n int64
	}
	tests := []struct {
		name string
		args args
		want int64
	}{
		{
			name: "should return 7, because abaabaabaa",
			args: args{
				s: "aba",
				n: 10,
			},
			want: 7,
		},
		{
			name: "should return 7, because aaaaaaaaaa",
			args: args{
				s: "aaa",
				n: 10,
			},
			want: 10,
		},
		{
			name: "should return 1000000000000",
			args: args{
				s: "a",
				n: 1000000000000,
			},
			want: 1000000000000,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := repeatedString(tt.args.s, tt.args.n); got != tt.want {
				t.Errorf("repeatedString() = %v, want %v", got, tt.want)
			}
		})
	}
}
