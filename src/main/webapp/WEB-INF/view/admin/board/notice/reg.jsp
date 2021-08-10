<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main>
	<h2 class="main title">공지사항 등록</h2>

	<div class="breadcrumb">
		<h3 class="hidden">breadlet</h3>
		<ul>
			<li>home</li>
			<li>게시글 관리</li>
			<li>공지사항</li>
		</ul>
	</div>

	<form action="reg" method="post" enctype="multipart/form-data">
		<div class="margin-top first">
			<h3 class="hidden">공지사항 입력</h3>
			<table class="table">
				<tbody>
					<tr>
						<th>제목</th>
						<td class="text-align-left text-indent text-strong text-orange"
							colspan="3"><input type="text" name="title" /></td>
					</tr>
					<tr>
						<th>카테고리</th>
						<td class="text-align-left text-indent text-strong text-orange"
							colspan="3"><select name="category">
								<option value="1">카테고리1</option>
								<option value="2">카테고리2</option>
								<option value="3">카테고리3</option>
								<option value="4">카테고리4</option>
						</select></td>
					</tr>
					<tr>
						<th>좋아하는 등 운동 : select box</th>
						<td class="text-align-left text-indent text-strong text-orange"
							colspan="3"><input type="checkbox" name="back-exercises"
							value="1" id="ch1"><label for="ch1">풀업(턱걸이)</label> <input
							type="checkbox" name="back-exercises" value="2" id="ch2"><label
							for="ch2">랫 풀 다운</label> <input type="checkbox"
							name="back-exercises" value="3" id="ch3"><label for="ch3">원
								암 덤벨 로우</label> <input type="checkbox" name="back-exercises" value="4"
							id="ch4"><label for="ch4">케이블 로우</label> <input
							type="checkbox" name="back-exercises" value="5" id="ch5"><label
							for="ch5">인버티드 로우</label> <input type="checkbox"
							name="back-exercises" value="6" id="ch6"><label for="ch6">시티드
								로우</label></td>
					</tr>
					<tr>
						<th>좋아하는 등 운동 : select box</th>
						<td class="text-align-left text-indent text-strong text-orange"
							colspan="3"><input type="radio" name="rd-back-exercise"
							value="1" id="rd1"><label for="rd1">풀업(턱걸이)</label> <input
							type="radio" name="rd-back-exercise" value="2" id="rd2"><label
							for="rd2">랫 풀 다운</label> <input type="radio"
							name="rd-back-exercise" value="3" id="rd3"><label
							for="rd3">원 암 덤벨 로우</label> <input type="radio"
							name="rd-back-exercise" value="4" id="rd4"><label
							for="rd4">케이블 로우</label></td>
					</tr>
					<tr>
						<th>첨부파일</th>
						<td colspan="3" class="text-align-left text-indent"><input
							type="file" name="files" /></td>
					</tr>
					<tr>
						<th>첨부파일</th>
						<td colspan="3" class="text-align-left text-indent"><input
							type="file" name="files" /></td>
					</tr>
					<tr class="content">
						<td colspan="4"><textarea class="content" name="content"></textarea></td>
					</tr>
					<tr>
						<td colspan="4" class="text-align-right"><input
							class="vertical-align" type="checkbox" id="open" name="open"
							value="true"><label for="open" class="margin-left">바로공개</label>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="margin-top text-align-center">
			<input class="btn-text btn-default" type="submit" value="등록" /> <a
				class="btn-text btn-cancel" href="list.html">취소</a>
		</div>
	</form>

</main>