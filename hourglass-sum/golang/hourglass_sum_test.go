package golang

import "testing"

func Test_hourglassSum(t *testing.T) {
	type args struct {
		arr [][]int32
	}
	tests := []struct {
		name string
		args args
		want int32
	}{
		{
			name: "should return 19",
			args: args{
				arr: [][]int32{{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}},
			},
			want: 19,
		},
		{
			name: "should return 28",
			args: args{
				arr: [][]int32{{-9, -9, -9, 1, 1, 1}, {0, -9, 0, 4, 3, 2}, {-9, -9, -9, 1, 2, 3}, {0, 0, 8, 6, 6, 0}, {0, 0, 0, -2, 0, 0}, {0, 0, 1, 2, 4, 0}},
			},
			want: 28,
		},
		{
			name: "should return 63",
			args: args{
				arr: [][]int32{{-9, -9, -9, 1, 1, 1}, {0, -9, 0, 4, 3, 2}, {-9, -9, -9, 1, 2, 3}, {0, 0, 8, 9, 9, 9}, {0, 0, 0, -2, 9, 0}, {0, 0, 1, 9, 9, 9}},
			},
			want: 63,
		},
		{
			name: "should return 63",
			args: args{
				arr: [][]int32{{-1, -1, 0, -9, -2, -2}, {-2, -1, -6, -8, -2, -5}, {-1, -1, -1, -2, -3, -4}, {-1, -9, -2, -4, -4, -5}, {-7, -3, -3, -2, -9, -9}, {-1, -3, -1, -2, -4, -5}},
			},
			want: -6,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := hourglassSum(tt.args.arr); got != tt.want {
				t.Errorf("hourglassSum() = %v, want %v", got, tt.want)
			}
		})
	}
}
